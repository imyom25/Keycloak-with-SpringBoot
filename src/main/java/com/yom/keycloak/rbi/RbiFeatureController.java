package com.yom.keycloak.rbi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by yogendra on 1/8/17.
 */
@Controller
public class RbiFeatureController {

    @Autowired
    FeatureService featureService;

    @GetMapping(path = "/features")
    public String getFeatures(Principal principal, Model model){
        model.addAttribute("principal",principal);
        model.addAttribute("features",featureService.getFeatures());
        return "features";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }


}
