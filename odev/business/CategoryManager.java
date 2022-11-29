package odev.business;


import odev.DataAcces.CategoryDao;
import odev.core.loging.Logger;
import odev.entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Logger> loggers;


    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        //productmanager newlendiğinde bir productdao ver . jdbc mi hiber mı
        this.categoryDao = categoryDao;
        this.loggers = loggers; //bu clasın içindeki loger kendisiene gönderilen logerlardır.
    }

    public void add(Category category) {


        categoryDao.add(category);

        for (Logger logger : loggers) { //[db,file
            logger.log(category.getName());
        }
    }
}
