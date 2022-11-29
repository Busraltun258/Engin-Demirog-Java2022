package odev.DataAcces;

import odev.entities.Category;
import odev.entities.Courses;
import odev.entities.Teachers;

//veri tabanı erişim şekilleri
public class HibernateProductDao implements CategoryDao, CoursesDao, TeachersDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veri tabanına kategori eklendi");

    }

    @Override
    public void add(Courses courses) {
        System.out.println("Hibernate ile veri tabanına kurs eklendi");

    }


    @Override
    public void add(Teachers teachers) {
        System.out.println("Hibernate ile veri tabanına eğitmen eklendi");

    }
}
