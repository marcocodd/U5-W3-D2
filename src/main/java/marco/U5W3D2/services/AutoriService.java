package marco.U5W3D2.services;

import marco.U5W3D2.entities.Autore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoriService {
    private List<Autore> autoriList = new ArrayList<>();

    public List<Autore> getAutoriList() {
        return autoriList;
    }
    
}
