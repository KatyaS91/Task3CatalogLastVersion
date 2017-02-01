package service;

import beans.BookNews;
import beans.News;
import dao.BookNewsDAO;
import dao.DAOException;
import dao.DAOFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 2/1/2017.
 */
public class BookNewsServiceImpl implements BookNewsService {

    public void addBookNews(News news) throws ServiceException{
        try {
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            BookNewsDAO bookNewsDAO = daoObjectFactory.getBookNewsDAO();
            bookNewsDAO.putBookNews(news);

        } catch (DAOException e){
            System.out.println(e.getMessage());
        }



    }
    public BookNews findAllBookNews(BookNews news) throws ServiceException{
        return null;
    }
}
