package odev.business;


import ders3oopWithLayerApp.entities.Product;
import odev.DataAcces.CategoryDao;
import odev.DataAcces.CoursesDao;
import odev.core.loging.Logger;
import odev.entities.Courses;

import java.util.List;

public class CoursesManager {
    private CoursesDao coursesDao;
    private List<Logger> loggers;


    public CoursesManager(CoursesDao coursesDao, List<Logger> loggers) {
        //productmanager newlendiğinde bir productdao ver . jdbc mi hiber mı
        this.coursesDao = coursesDao;
        this.loggers = loggers; //bu clasın içindeki loger kendisiene gönderilen logerlardır.
    }

    public void add(Courses courses) throws Exception { //response request pattern yapıya göre yeniden ele alınacak.
        //iş kurallarını yazarız neden:daha önce bu kullanıcı kayıtlı olabilir vs.
        //kötü kod
        if (courses.getPrice() < 0) {
            //hata fırlatalım
            throw new Exception("Ürün fiyato 0 dan küçük olamaz");

        }
         coursesDao.add(courses);

        for (Logger logger:loggers){ //[db,file
            logger.log(courses.getName());
        }
    }
}
