package com.teste.exemplo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.exemplo.model.Produto;
import com.teste.exemplo.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll() {
        return produtoRepository.getProdutos();
    }

    public Produto findById(Integer id) {
        return produtoRepository.getProdutoById(id);
    }

    public Produto save(Produto produto) {
        return produtoRepository.addProduto(produto);
    }

    public void deleteById(Integer id) {
        produtoRepository.deleteProduto(id);
    }

    public Produto update(Produto produto) {
        return produtoRepository.updateProduto(produto);
    }

}
