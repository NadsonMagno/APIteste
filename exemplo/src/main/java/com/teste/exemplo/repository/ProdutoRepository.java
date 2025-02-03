package com.teste.exemplo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.teste.exemplo.model.Produto;
@Repository
public class ProdutoRepository {
    
  
        private List<Produto> produtos = new ArrayList<Produto>();
        private Integer ultimoId = 0;
    
        public List<Produto> getProdutos() {
            return produtos;
        }
    
        public Produto getProdutoById(Integer id) {
            for (Produto produto : produtos) {
                if (produto.getId().equals(id)) {
                    return produto;
                }
            }
            return null;
        }
    
        public Produto addProduto(Produto produto) {
            produto.setId(ultimoId++);
            produtos.add(produto);
            return produto;
        }
    
        public Produto updateProduto(Produto produto) {
            for (Produto p : produtos) {
                if (p.getId().equals(produto.getId())) {
                    p.setNome(produto.getNome());
                    p.setQuantidade(produto.getQuantidade());
                    p.setPreco(produto.getPreco());
                    p.setDescricao(produto.getDescricao());
                    return p;
                }
            }
            return null;
        }
    
        public void deleteProduto(Integer id) {
            produtos.removeIf(produto -> produto.getId().equals(id));
        }   
    }


