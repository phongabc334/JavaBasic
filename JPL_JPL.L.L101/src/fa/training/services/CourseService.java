/*
 *
 *
 * @author PhongLe
 * @date Jan 26, 2022
*/
package fa.training.services;

import java.io.*;
import java.util.*;

import fa.training.models.*;
import fa.training.utils.*;

public class CourseService {
	public List<Course> createCourse(Scanner scanner) {
		String loop, id, title, credit, enrollment;
		double doCredit;
		int intEnrollment;
		Course course;
		Set<Student> students = new HashSet<Student>();
		List<Course> courses = new ArrayList<Course>();
		StudentService studentService = new StudentService();
		do {
			course = new Course();
			// Set course id
			do {
				System.out.println("Enter course id:");
				id = scanner.nextLine();
				try {
					course.setId(id);
				} catch (InvalidIdException e) {
					continue;
				}
				break;
			} while (true);

			// Set course title
			System.out.println("Enter course title:");
			title = scanner.nextLine();
			course.setTitle(title);
			do {
				System.out.println("Enter course credit:");
				credit = scanner.nextLine();
				try {
					doCredit = Validator.isCredit(credit);
					course.setCredit(doCredit);
				} catch (NumberFormatException e) {
					continue;
				}
				break;
			} while (true);
			do {
				System.out.println("Enter course enrollment:");
				enrollment = scanner.nextLine();
				try {
					intEnrollment = Validator.isEnrollment(enrollment);
					course.setEnrollment(intEnrollment);
				} catch (NumberFormatException e) {
					continue;
				}
				break;
			} while (true);
			// Set student to the course
			System.out.println("----Enter Student in the Course----");
			students = studentService.createStudent(scanner, intEnrollment);
			course.setStudents(students);

			// Add course to list
			courses.add(course);

			// Do you want to continue?
			System.out.println("Do you want continue to input course (Y/N)?: ");
			loop = scanner.nextLine();
		} while (loop.charAt(0) == 'Y' || loop.charAt(0) == 'y');
		return courses;
	}

	public String save(List<Course> courses) throws Exception {
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(Constant.FILE_PATH));
			objectOutputStream.writeObject(courses);
		} catch (Exception exception) {
			throw new Exception();
		} finally {
			if (objectOutputStream != null) {
				objectOutputStream.close();
			}
		}
		return Constant.SUCCESS;
	}

	@SuppressWarnings("unchecked")
	public List<Course> getAll() throws IOException {
		ObjectInputStream objectInputStream = null;
		List<Course> courses;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream(Constant.FILE_PATH));
			courses = (List<Course>) objectInputStream.readObject();
		} catch (Exception exception) {
			throw new IOException();
		} finally {
			if (objectInputStream != null) {
				objectInputStream.close();
			}
		}
		return courses;
	}

	public void sortAndDisplay(List<Course> courses) {
		Collections.sort(courses, new CourseTitleCompare());
		System.out.println("---------------COURSE LIST-------------------");
		for (Course course : courses) {
			System.out.format("%s%20s%12.3f%5d%100s%n", course.getId(), course.getTitle(), course.getCredit(),
					course.getEnrollment(), course.getStudents());
		}
	}

	public List<Course> getByStudent(String studentId) throws IOException {
		List<Course> courses = getAll();
		List<Course> coursesByStudent = new ArrayList<Course>();

		if (courses != null) {
			for (Course course : courses) {
				for (Student studentCourse : course.getStudents()) {
					if (studentId.equalsIgnoreCase(studentCourse.getId())) {
						coursesByStudent.add(course);
					}
				}
			}
		}
		return coursesByStudent;
	}

	public String remove(String id) throws Exception {
		boolean removed = false;

		List<Course> courses = getAll();
		if (courses == null) {
			throw new IOException();
		}
		Iterator<Course> iterator = courses.iterator();
		while (iterator.hasNext()) {
			Course course = iterator.next();
			if (id.equalsIgnoreCase(course.getId())) {
				iterator.remove();
				removed = true;
				break;
			}
		}

		if (removed) {
			try {
				// update list
				save(courses);
			} catch (Exception e) {
				throw new Exception();
			}

			return Constant.SUCCESS;
		}
		return Constant.FAIL;
	}
}
