package com.restart1025.springboot.rec;

import com.restart1025.springboot.queryRec.QueryRec;
import com.restart1025.springboot.queryRec.QueryRecRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


@RestController
public class RecController {

    @Autowired
    private RecRepository recRepository;

    @Autowired
    private QueryRecRepositoryCustom queryRecRepositoryCustom;
	
	@GetMapping("/getRecs")
	public List<Rec> getRecs() {
        return recRepository.findAll();
	}

    @PostMapping("/saveRec")
    public void saveRec(@RequestBody Rec rec){ recRepository.save(rec);}

    @PostMapping("/deleteRec")
    public void deleteRec(@RequestBody Rec rec){ recRepository.delete(rec);}

    @PostMapping("/queryRec")
    public List<Rec> queryRec(@RequestBody QueryRec queryRec){ return queryRecRepositoryCustom.queryRec(queryRec);}
}