package io.swagger.api;

import io.swagger.model.Inventory;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-11T20:01:06.520Z")

@Controller
public class StoreApiController implements StoreApi {

    public ResponseEntity<List<Inventory>> getInventory() {
    	List<Inventory> list = new ArrayList<>();
    	list.add(new Inventory(1, 100.00));
    	list.add(new Inventory(2, 235.45));
    	list.add(new Inventory(3, 89.45));
    	list.add(new Inventory(4, 56.47));
    	list.add(new Inventory(5, 90.00));
    	list.add(new Inventory(6, 0.00));
    	list.add(new Inventory(7, 378.34));
    	list.add(new Inventory(8, 237.67));
    	list.add(new Inventory(9, 874.23));
    	list.add(new Inventory(10, 356.84));
    	list.add(new Inventory(11, 487.86));
    	
        return new ResponseEntity<List<Inventory>>(list, HttpStatus.OK);
    }

}
