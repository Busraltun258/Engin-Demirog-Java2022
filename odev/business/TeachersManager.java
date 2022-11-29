package odev.business;


import odev.DataAcces.CategoryDao;
import odev.DataAcces.TeachersDao;
import odev.core.loging.Logger;
import odev.entities.Category;
import odev.entities.Teachers;

import java.util.List;

public class TeachersManager {
    private TeachersDao teachersDao;

    private List<Logger> loggers;


    public TeachersManager(TeachersDao teachersDao, List<Logger> loggers) {
        //productmanager newlendiğinde bir productdao ver . jdbc mi hiber mı
        this.teachersDao = teachersDao;
        this.loggers = loggers; //bu clasın içindeki loger kendisiene gönderilen logerlardır.
    }

    public void add(Teachers teachers) {


        teachersDao.add(teachers);

        for (Logger logger : loggers) { //[db,file
            logger.log(teachers.getName());
        }
    }
}
