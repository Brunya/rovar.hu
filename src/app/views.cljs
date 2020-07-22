(ns app.views
  (:require [reagent.core :as reagent :refer [atom]]))

(defn app []
  [:main
   [:container
    ; [:div.header
    ;  [:div.title
    ;   [:h1 "EDAPHOLOG 2.0"]
    ;   [:p "A novel species-specific machine vision technique to detect soil microarthropods."]]
    ;  [:img {:src "/images/futtató2.jpeg"}]]
    [:div.col
     [:div.alternative-title
      [:h1 "EDAPHOLOG 2.0"]
      [:p "A novel species-specific machine vision technique to detect soil microarthropods."]]
     [:h6 "Images taken during the project"]]
    [:div.content
     [:div.problem
      [:div.headline
       [:h2 "Problem & Our Solution"]]
      [:p "Insect populations changes enormously in space and time, there is no appropriate method to be used in the applied or commercialised fields of pest management, ecology, toxicology and epidemiology. The only solution is automatic detection."]
      [:img {:src "/images/ss1.png"}]
      [:img {:src "/images/ss2.png"}]
      [:p " Our Heteromurus - Folsomia classification accuracy is ~94% from 550 images"]]
     [:div.device
      [:div.headline
       [:h2 "The Device"]]
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
        [:h3 "Easily teachable machine"]]
       [:div.grid-item
        [:h3 "Real-time data connection"]
        [:p "between the server, microcomputer and user interface"]]
       [:div.grid-item
        [:h3 "Multi-cam motion detection"]
        [:p "with a low power microcomputer"]]
       [:div.grid-item
        [:h3 "AI accelerator"]
        [:p "integrated circuit developed for neural network machine learning"]]]]
     [:div.team
      [:div.headline
       [:h2 "Team:"]]
      [:div.logo-up
       [:img {:src "/images/zoolog.png"}]
       [:img {:src "/images/taki.jpeg"}]]
      [:div.logo-down
       [:img {:src "/images/dd-logó.png"}]
       [:img {:src "/images/codestorm.png"}]
       [:img {:src "/images/zgen_kibernetika.png"}]]]]
    [:div.footer
     [:h4 "Edapholog - 2020"]]]])
