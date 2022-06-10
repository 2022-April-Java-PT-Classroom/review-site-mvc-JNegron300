package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    ReviewRepository reviewRepo = new ReviewRepository();

    @RequestMapping(value = "reviews")
    public String AllReviews(Model model) {
        model.addAttribute("reviews", reviewRepo.allReviews());
        return "reviews";
    }

    @RequestMapping("review")
    public String getReview(@RequestParam Long id, Model model) {
        model.addAttribute("reviews", reviewRepo.getOne(id));
        return "review";
    }
}
