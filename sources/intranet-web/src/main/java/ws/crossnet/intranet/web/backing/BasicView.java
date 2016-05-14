package ws.crossnet.intranet.web.backing;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author ianache
 */
@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView {
    
    private List<Factura> cars;
     
    @ManagedProperty("#{facturaService}")
    private FacturaService service;
 
    @PostConstruct
    public void init() {
        cars = service.createCars(10);
    }
     
    public List<Factura> getCars() {
        return cars;
    }
 
    public void setService(FacturaService service) {
        this.service = service;
    }
}
