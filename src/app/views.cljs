(ns app.views
  (:require [reagent.core :as reagent :refer [atom]]))

(def lang (reagent/atom "en"))

(defn szoveg [angol magyar]
  (case @lang
    "en" angol
    "hu" magyar))

(defn app []
  [:main
   [:container
    ; [:div.header
    ;  [:div.title
    ;   [:h1 "EDAPHOLOG 2.0"]
    ;   [:p "A novel species-specific machine vision technique to detect soil microarthropods."]]
    ;  [:img {:src "/images/futtató2.jpeg"}]]
    [:div.col
    [:select {:on-change #(reset! lang (.. % -target -value))}
      [:option (merge {:value "en" } (szoveg {:selected "selected"} nil)) "English"]
      [:option (merge {:value "hu"} (szoveg nil {:selected "selected"})) "Magyar"]]
     [:div.alternative-title
      [:h1 "EDAPHOLOG 2.0"]
      [:p (szoveg "A novel species-specific machine vision technique to detect soil microarthropods."
                  "Egy korszerű, gépi látáson alapuló, fajspecifikus technika a talajlakó mikroarthropodák felismerésére.")]]
     [:h6 (szoveg "Photo taken by EDAPHOLOG"
                  "A fotók az EDAPHOLOG-al készültek")]]
    [:div.content
     [:div.problem
      [:div.headline
       [:h2 (szoveg "Problem & Our Solution"
                    "Probléma & Megoldásunk")]]
      [:p (szoveg "Insect populations changes enormously in space and time, there is no appropriate method to be used in the applied or commercialised fields of pest management, ecology, toxicology and epidemiology. The only solution is automatic detection."
                  "A rovarpopulációk óriási változásokat mutatnak térben és időben, vizsgálatukra nincs megfelelő módszer a kártevőírtás, ökológia, toxikológia és a járványtan területein. Az egyetlen megoldás az automatikus felismerés.")]
      [:img {:src "/images/ss1.png"}]
      [:img {:src "/images/ss2.png"}]
      [:p (szoveg " Our Heteromurus - Folsomia classification accuracy is ~94% from 550 images"
                  "A Heteromurus - Folsomia osztályozásunk pontossága: ~94% - 550 képből")]]
     [:div.device
      [:div.headline
       [:h2 (szoveg "The Device"
                    "Az eszköz")]]
      [:div.imgrow-cad
       [:img {:src "/images/futtató.jpeg"}]
       [:img {:src "/images/futtató2.jpeg"}]
       [:img {:src "/images/futtató4.jpeg"}]]
      [:img.icon {:src "/images/arrow.png"}]
      [:div.imgrow-photo
       [:img {:src "/images/photo3.jpeg"}]
       [:img {:src "/images/photo2.jpeg"}]
       [:img {:src "/images/photo1.jpeg"}]]
      [:div.grid-container
       [:div.grid-item
        [:h3 (szoveg "Easily teachable machine"
                     "Könnyen tanítható eszköz")]]
       [:div.grid-item
        [:h3 (szoveg "Real-time data connection"
                     "Valós idejű adatkapcsolat")]
        [:p (szoveg "between the server, microcomputer and user interface"
                    "a szerver, a mikroszámítógép és a felhasználói felület között")]]
       [:div.grid-item
        [:h3 (szoveg "Multi-cam motion detection"
                     "Több kamerás mozgásérzékelés")]
        [:p (szoveg "with a low power microcomputer"
                    "kis teljesítményű mikroszámítógéppel")]]
       [:div.grid-item
        [:h3 (szoveg "AI accelerator"
                     "AI gyorsító")]
        [:p (szoveg "integrated circuit developed for neural network machine learning"
                    "integrált áramkör a neurális hálózat gépi tanulásra tervezve")]]]]
     [:div.team
      [:div.headline
       [:h2 (szoveg "Team:"
                    "Csapat:")]]
      [:div.logo-up
       [:img {:src "/images/zoolog.png"}]
       [:img {:src "/images/taki.jpeg"}]]
      [:div.logo-down
       [:img {:src "/images/dd-logó.png"}]
       [:img {:src "/images/codestorm.png"}]
       [:img {:src "/images/zgen_kibernetika.png"}]]]]
    [:div.footer
     [:h4 "Edapholog - 2020"]]]])
