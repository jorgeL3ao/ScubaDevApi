package scuba.dev.api.controller;

import org.springframework.web.bind.annotation.*;
import scuba.dev.api.student.DadosCadastroStudent;

@RestController
@RequestMapping("Medicos")
public class StudentController {

    @PostMapping
    public void cadastrar( @RequestBody DadosCadastroStudent dados){

        System.out.println(json);

    }
}
