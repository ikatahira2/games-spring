package application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMedhod;
import org.springframework.web.bind.annotation.ResquestParam;

import application.model.Categoria;
import application.repository.CategoriaRepository;


@Controller
@RequestMapping("/categoria")
public class CategoriaController{
    @Autowired
    private CategoriaController categoriaRepo;

@RequestMapping("/list")
public String list (Model ui){
    ui.addAttribute("categorias", categoriaRepo.findAll());
    return "categoria/list";
}
@RequestMapping("/insert")
public String insert(){
    return "categoria/insert";
}

@RequestMapping(value = "/insert", method = RequestMedhod.POST)
public String insert(@ResquestParam("nome") String nome){
    Categoria categoria = new Categoria();
    categoria.setNome(nome);

    categoriaRepo.save(categoria);
    
    return "redirect:/categoria/list";
}
@RequestMapping("/update")
public String update(
    @ResquestParam("id") long ind,
    Model ui){
        Optional<Categoria> categoria = categoriaRepo.findById(id);
    
        if(categoria.isPresent()){
            ui.addAttribute("categoria", categoria.geet());
            return "categoria/update";
        }    
        return "redirect:/categoria/list";
    
    }

@RequestMapping (value = "")



}