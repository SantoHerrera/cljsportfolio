(ns hello-world-react.core
  (:require [reagent.core :as r]))

(+ 4 4 (+ 9 9))

(defn my-div []
  [:div
   [:p "fucking works!"]])

(defn my-home-page []
  [:div (my-div)])


(+ 4 2354)

;; -------------------------
;; Initialize app

(defn init! []
  (r/render [my-home-page] (.getElementById js/document "app")))

