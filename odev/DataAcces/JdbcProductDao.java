package odev.DataAcces;

import odev.entities.Category;
import odev.entities.Courses;
import odev.entities.Teachers;

public class JdbcProductDao implements CoursesDao,CategoryDao,TeachersDao {
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veri tabanına kategori eklendi");

    }

    @Override
    public void add(Courses courses) {
        System.out.println("JDBC ile veri tabanına kurs eklendi");

    }

    @Override
    public void add(Teachers teachers) {
        System.out.println("JDBC ile veri tabanına eğitmen eklendi");

    }
}
