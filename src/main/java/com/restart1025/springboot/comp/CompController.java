package com.restart1025.springboot.comp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CompController {

    @Autowired
    private CompRepository compRepository;

	@GetMapping("/getComps")
	public List<Comp> getComps() {
        return compRepository.findAll();
	}

    @PostMapping("/saveComp")
    public void saveComp(@RequestBody Comp comp) {
        compRepository.save(comp);
    }

    @PostMapping("/deleteComp")
    public void deleteComp(@RequestBody Comp comp) {
        compRepository.delete(comp);
    }
}