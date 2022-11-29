package odev;


import odev.DataAcces.HibernateProductDao;
import odev.DataAcces.JdbcProductDao;
import odev.business.CoursesManager;
import odev.business.TeachersManager;
import odev.core.loging.DataBaseLoger;
import odev.core.loging.FileLoger;
import odev.core.loging.Logger;
import odev.core.loging.MailLogger;
import odev.business.CategoryManager;
import odev.entities.Category;
import odev.entities.Courses;
import odev.entities.Teachers;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Courses courses1=new Courses(12,"java","123",232);
        Logger[] loggers={new DataBaseLoger(),new FileLoger(),new MailLogger()};
        CoursesManager coursesManager=new CoursesManager(new JdbcProductDao(), List.of(loggers));
        coursesManager.add(courses1);
        System.out.println("----------------------------------------------------------");
        Category category1=new Category("yazılım",23);
        CategoryManager categoryManager=new CategoryManager(new HibernateProductDao(),List.of(loggers));
        categoryManager.add(category1);
        System.out.println("----------------------------------------------------------");

        Teachers teachers1=new Teachers(1,"Engin","Demirog",5,"erkek");
        TeachersManager teachersManager=new TeachersManager(new JdbcProductDao(),List.of(loggers));
        teachersManager.add(teachers1);
        System.out.println("----------------------------------------------------------");


    }
}
