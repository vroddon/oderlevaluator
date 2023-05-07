package oeg.odrlevaluator.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import oeg.odrlevaluator.model.Policy;
import oeg.odrlevaluator.model.Status;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author victor
 */
@RestController
@RequestMapping(value = "/api/status")
@Api(tags = "status", value = "Shows status information for this application.")
public class StatusController {

    @ApiOperation(value = "Shows status information for this application.", notes = "Different types of status can be retrieved.")
    @GetMapping(value = "", produces = "application/json")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public Status statusget(
    @ApiParam(name="value", value="Refines the status information",  example="") @RequestParam(defaultValue="", required = false) String value
    ) {
        return Status.getStatus();
    }
   
    @ApiOperation(value = "Tests the post funcionality.", notes = "Different types of status can be retrieved.")
    @PostMapping(value = "", produces="application/json", consumes = "application/json")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public Policy statuspost(@RequestBody Policy p) {
        return p;
    }
}
