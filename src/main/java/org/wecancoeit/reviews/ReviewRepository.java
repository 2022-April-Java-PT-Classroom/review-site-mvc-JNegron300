package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviews = new HashMap<>();


    public ReviewRepository(Review... reviews) {
        ReviewModel(reviews);
    }

    private void ReviewModel(Review... reviews) {
        for (Review review : reviews) {
            this.reviews.put(review.getId(), review);
        }
    }

    public ReviewRepository() {
        Review review1 = new Review(1L, "FallOut 4", "/images/FO4.jpg", "action role-playing game", "The world, exploration, crafting, atmosphere, and story of Fallout 4 are all key parts of this hugely successful sandbox role-playing game. Great new reasons to obsessively gather and hoard relics of happier times, strong companions, and sympathetic villains driving tough decisions make it an adventure I’ll definitely replay and revisit. Even the technical shakiness that crops up here and there can’t even begin to slow down its momentum.", "Initial release date: November 10, 2015");
        Review review2 = new Review(2L, "League of Legends", "/images/LoL.jpg", "multiplayer online battle arena", "Every match is like an entire multiplayer action-RPG condensed into 20-to-50 minutes. Each player starts with nothing but command of a single unit and one special skill. They're split into two opposing teams of five and let loose against each other over a top-down battlefield. Smiting enemy units in real time earns gold and experience, which grant access to increasingly powerful skills and a choice of better gear. The team that wins is the team that best leverages its units’ particular strengths. \n" +
                "\n" +
                "Your ultimate objective is to destroy the opposing team's headquarters. The fighting mostly occurs across three roads leading to each “Nexus.” Each path is defended by AI sentinels and human players desperate to justify their use of free time. ", "Initial release date: October 27, 2009");
        Review review3 = new Review(3L, "Assassins Creed Valhalla", "/images/AC.jpg", "open-world action-adventure stealth video game", "Assassin’s Creed Valhalla’s story follows Eivor, a male or female Norse Viking who grows up with a chip on their shoulder and vengeance in their heart after some particularly dastardly events in the opening cinematic. From those starting moments, the table is set and soon you and your brother Sigurd are off on a grand adventure to England, a land ripe with wealth and glory, and already well-integrated with Danes and Norse from years of Viking invasion and conquest. That sets the stage for your arrival in England as you settle the land and forge alliances to protect and expand your fledgling homestead against the chaos and political dust storm of warring factions across England’s four kingdoms: Mercia, East Anglia, Northumbria, and Wessex.", "Initial release date: November 10, 2020");
        Review review4 = new Review(4L, "Old School Runescape", "/images/osrs.jpg", "massively multiplayer online role-playing game", "point-and-click interface, Old School is about as barebones as it gets, but simplicity isn't necessarily a bad thing", "Initial release date: February 22, 2013");

        reviews.put(review1.getId(),review1);
        reviews.put(review2.getId(),review2);
        reviews.put(review3.getId(),review3);
        reviews.put(review4.getId(),review4);
    }

    public Collection<Review> allReviews() {
        return reviews.values();
    }

    public Review getOne(long reviewID){
        return reviews.get(reviewID);
    }

}
