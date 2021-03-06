package it.contrader.sprint3.controller;

import it.contrader.sprint3.model.VehicleEntity;
import it.contrader.sprint3.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {

    private VehicleService vehicleService;


    @Autowired
    public VehicleController(VehicleService vehicleService)
    {
        this.vehicleService = vehicleService;
    }


    @RequestMapping(value="/allvehicles", method = RequestMethod.GET)
    public String getAllVehicles (Model model)
    {
        List<VehicleEntity> allVehicles = vehicleService.getAllVehicles();
        model.addAttribute("allVehicles", allVehicles);
        return "allVehicles";
    }

    @RequestMapping(value="/insertVehicle", method = RequestMethod.GET)
    public String getinsertVehicles (@ModelAttribute VehicleEntity vehicle,Model model)
    {
        List<VehicleEntity> allVehicles = vehicleService.getAllVehicles();
        for (VehicleEntity v:allVehicles)
        {
            if(v.equals(vehicle))
            {
                model.addAttribute("msg","Veicolo gi&agrave presente");
                return "insertVehicle";
            }
        }
        vehicleService.insert(vehicle);
        model.addAttribute("msg","Veicolo aggiunto");
        return "menuAdmin";
    }

}