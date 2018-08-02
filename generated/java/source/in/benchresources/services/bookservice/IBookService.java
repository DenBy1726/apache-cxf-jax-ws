package in.benchresources.services.bookservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2018-08-01T16:17:55.825+03:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://benchresources.in/services/BookService/", name = "IBookService")
@XmlSeeAlso({in.benchresources.entities.book.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IBookService {

    @WebMethod
    @WebResult(name = "BookResponseType", targetNamespace = "http://benchresources.in/entities/Book", partName = "parameters")
    public in.benchresources.entities.book.BookResponseType getBookByISDNRequestNumber(
        @WebParam(partName = "parameters", name = "BookRequestType", targetNamespace = "http://benchresources.in/entities/Book")
        in.benchresources.entities.book.BookRequestType parameters
    );
}
