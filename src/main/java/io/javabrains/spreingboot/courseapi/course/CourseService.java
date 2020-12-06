package io.javabrains.spreingboot.courseapi.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository CourseRepository;

    public List<Course> getAllCourse(String topicId) {
        //
        List<Course> Courses = new ArrayList<>();
        CourseRepository.findByTopicId(topicId)
        .forEach(Courses::add);
        return Courses;
    }

    public Course getCourse(String id) {
        //return Courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return CourseRepository.findById(id).get();
    }

	public void addCourse(Course course) {
        //Courses.add(Course);
        CourseRepository.save(course);
	}

	public void updateCourse(Course course) {
        CourseRepository.save(course);
	}

	public void deleteCourse(String id) {
        //Courses.removeIf(t -> t.getId().equals(id));
        CourseRepository.deleteById(id);
	}
    
}
