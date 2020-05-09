package com.example.Project_09_05_20;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class OrganizationController {
    @Autowired
    private OrganizationAction organizationAction;
    @Autowired
    private OrganizationTypeAction organizationTypeAction;
    private Integer n = 1;
    @GetMapping (path = "/list")
    public @ResponseBody Iterable <Organization> getAllOrganizations () {
        return organizationAction.findAll ();
    }
    @GetMapping (path = "/listType")
    public @ResponseBody Iterable <OrganizationType> getAllOrganizationTypes () {
        return organizationTypeAction.findAll ();
    }
    @GetMapping (path = "/add")
    public @ResponseBody String addNewOrganization (@RequestParam String name, @RequestParam Integer latitude,
        @RequestParam Integer longitude, @RequestParam String address) {
        Organization organization = new Organization ();
        organization.setName (name);
        organization.setLatitude (latitude);
        organization.setLongitude (longitude);
        organization.setType (organizationTypeAction.findById (n).get ());
        organization.setAddress (address);
        organizationAction.save (organization);
        ++ n;
        return "Saved!!!";
    }
    @GetMapping (path = "/addType")
    public @ResponseBody String addNewOrganizationType (@RequestParam String name) {
        OrganizationType organizationType = new OrganizationType ();
        organizationType.setName (name);
        organizationTypeAction.save (organizationType);
        return "Saved!!!";
    }
}