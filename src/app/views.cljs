(ns app.views
  (:require [reagent.core :as reagent :refer [atom]]))

(def lang (reagent/atom "en"))

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
     [:h6 "Photo taken by EDAPHOLOG"]]
    [:div.content
     [:div.problem
       [:div.headline
        [:h2 "Problem & Our Solution"]]
       [:div.problem-flex
        [:video {:width "640" :height "320" :autoplay "autoplay" :loop "loop"}
          [:source {:src "/videos/felvetel2.mp4" :type "video/mp4"}]]
        [:p "Insect populations changes enormously in space and time, there is no appropriate method to be used in the applied or commercialised fields of pest management, ecology, toxicology and epidemiology. The only solution is automatic detection."]]]
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
