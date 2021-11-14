package Controller;


import Model.Adherant;
import Repository.AdherantRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ad")
public class AdherantController {


    @Autowired
  private   AdherantRepository adherantRepository;

    @GetMapping("adherants/")
    public List<Adherant> getAdherants(){
        return this.adherantRepository.findAll();
    }
}
