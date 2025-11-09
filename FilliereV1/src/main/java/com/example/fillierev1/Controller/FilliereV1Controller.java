package com.example.fillierev1.Controller;

import com.example.fillierev1.DTO.FilliereRequest;
import com.example.fillierev1.DTO.FilliereResponse;
import com.example.fillierev1.Services.FilliereService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/fillieres") // <-- préfixe
public class FilliereV1Controller {

    private final FilliereService filliereService;

    public FilliereV1Controller(FilliereService filliereService) {
        this.filliereService = filliereService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<FilliereResponse> getById(@PathVariable Integer id) {
        FilliereResponse filliere = filliereService.getById(id);
        return ResponseEntity.ok(filliere);
    }
   // @PreAuthorize("hasAuthority('SCOPE_ADMIN')")
    @PostMapping
    public ResponseEntity<FilliereResponse> create(@RequestBody FilliereRequest request) {
        FilliereResponse created = filliereService.create(request);
        return ResponseEntity
                .created(URI.create("/api/v1/fillieres/" + created.getId())) // attention au nom du getter
                .body(created);
    }
    @GetMapping("/getAll")
  public ResponseEntity<List<FilliereResponse>> getAll() {
        return ResponseEntity.ok(filliereService.getAllFilliere());
    }
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<FilliereResponse> delete(@PathVariable Integer  id) {
    filliereService.deleteById(id);
    return ResponseEntity.noContent().build();

  }
    @GetMapping("/hello")
    public String hello() {
        return "✅ Microservice Filliere fonctionne correctement !";
    }
}
