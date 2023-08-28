package com.produto.celta.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produto.celta.dto.ProdutosDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class ProdutosController {

private final List<ProdutosDTO> produtos = new ArrayList<>();

    @PostMapping("/produtos")
    public ResponseEntity<Map<String, Object>> registerProduct(@RequestBody ProdutosDTO produtosDTO) {
        produtosDTO.setId((long) (produtos.size() + 1));
        produtos.add(produtosDTO);

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/produtos")
    public ResponseEntity<List<ProdutosDTO>> getProdutos() {
        return ResponseEntity.ok(produtos);
    }

    @DeleteMapping("/produtos/{produtoId}")
    public ResponseEntity<Map<String, Object>> deleteProduto(@PathVariable Long produtoId) {
        boolean removed = false;
    for (ProdutosDTO produtosDTO : produtos) {
        if (produtosDTO.getId().equals(produtoId)) {
            produtos.remove(produtosDTO);
            removed = true;
            break;
        }
    }

        Map<String, Object> response = new HashMap<>();
        response.put("success", removed);

        return removed ? ResponseEntity.ok(response) : ResponseEntity.badRequest().body(response);
    }
}
