package com.example.exospringbootmvc.Controller;

import com.example.exospringbootmvc.DATA.MessageDAO;
import com.example.exospringbootmvc.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MessageController {

  // private List<Message> messageList = new ArrayList<>();

    // on na pas besoin puisqu'on va faire un autowired
    @Autowired
    private MessageDAO messageDAO;
    @PostMapping("/msg")
    public String getMessage(@ModelAttribute Message newMessage ){
        Message msg = new Message(newMessage.getAutor(), newMessage.getMessage());
        messageDAO.save(msg);
       // messageList.add(newMessage);

        return "redirect:msg";
    }
    @GetMapping("/msg")
    public String showMessage (Model model){
  /* Message msg1 = new Message ("daniel", "Hello toi");
  Message msg2 = new Message("Moussa", "Bonjour"); */
//le model du DAO
        model.addAttribute("msglist", messageDAO.findAll());
        model.addAttribute("message", new Message());
 // messageList.add(msg1);
 // messageList.add(msg2);

 // model.addAttribute("msglist", messageList);
  // le model pour le post
      //  model.addAttribute("newMessage", new Message());

        return "msg";
    }
}
