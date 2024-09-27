package com.senacead.productsreview.controller;

import com.senacead.productsreview.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoriaController {
    
    private List<Categoria> listaCategorias = new ArrayList();
    
    //metodo para cadastrar uma nova categoria
    @GetMapping("/cadastrar-categoria")
    public String cadastrarCategoria(Model model){
        model.addAttribute("categoria",new Categoria());
        return "cadastrar-categoria";
    }
    
    //metodo para adicionar uma nova categoria na lista de categorias
    @PostMapping("/cadastrar-categoria")
    public String adicionarCategoria(@ModelAttribute Categoria categoria, Model model){
        categoria.setId(listaCategorias.size()+1);
        listaCategorias.add(categoria);
        model.addAttribute("categoria", new Categoria());
        model.addAttribute("mensaggem", "Categoria cadastrada com sucesso");
        return "cadastrar-categoria"; 
    }
    
    //metodo para listar os produtos cadastrados no sistema
    @GetMapping("/lista-categorias")
    public String listarCategorias(Model model){
        model.addAttribute("listaCategorias", listaCategorias);
        return "lista-categorias";
    }
    
    //metodo para mostrar os detalhes de cada categoria
    @PostMapping("/detalhe-categoria")
    public String detalharCategoria(Model model, @RequestParam("categoria") String id){
        Integer idCategoria = Integer.valueOf(id);
        Categoria categoriaEncontrada = getCategoriaId(idCategoria);
        
        if(categoriaEncontrada != null){
            model.addAttribute("categoria", new Categoria());
        } else {
            model.addAttribute("mensagem", "Categoria não encontrada");
        }
        
        return "detalhe-categoria";  
    }
    
    //metodo para obter uma categoria pelo id
    public Categoria getCategoriaId(Integer id){
        for(Categoria categoria : listaCategorias){
            if(categoria.getId().intValue() == id){
                return categoria;
            }
        }
        return null;
    } 
    
}
