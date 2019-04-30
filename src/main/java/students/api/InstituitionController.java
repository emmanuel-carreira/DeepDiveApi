package students.api;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstituitionController {

    private final InstitutionService service;

    @RequestMapping(path = "/instituitions", method = RequestMethod.POST)
    public CreateInstituitionResponse createInstituition(@RequestBody CreateInstituitionRequest request){
        System.out.println(request);
        final Instituition inst = Instituition
        return CreateInstituitionResponse.of()
    }
}
