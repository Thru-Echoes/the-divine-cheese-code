(ns the-divine-cheese-code.core
  (:import java.util.HashMap
           java.util.ArrayList)
  (:require [clojure.java.browse :as browse]
            [clojure.data.json :as json]
            [the-divine-cheese-code.visualization.svg :refer [xml]])
  (:gen-class))
;; Ensure that the SVG code is evaluated
;; Refer the namespace so that you don't have to use the
;; fully qualified name to reference svg functions


(def heists [{:location "Cologne, Germany"
              :cheese-name "Archbishop Hildebold's Cheese Pretzel"
              :lat 50.95
              :lng 6.97}
             {:location "Zurich, Switzerland"
              :cheese-name "The Standard Emmental"
              :lat 47.37
              :lng 8.55}
             {:location "Marseille, France"
              :cheese-name "Le Fromage de Cosquer"
              :lat 43.30
              :lng 5.37}
             {:location "Zurich, Switzerland"
              :cheese-name "The Lesser Emmental"
              :lat 47.37
              :lng 8.55}
             {:location "Vatican City"
              :cheese-name "The Cheese of Turin"
              :lat 41.90
              :lng 12.45}])

(defn url
  [filename]
  (str "file:///"
       (System/getProperty "user.dir")
       "/"
       filename))

(defn template
  [contents]
  (str "<style>polyline { fill: none; stroke: #5881d8; stroke-width: 3;}</style>"
       contents))

(defn -main
  [& args]
  (let [filename "map.html"]
    (->> heists
         (xml 50 100)
         template
         (spit filename))
    (browse/browse-url (url filename))))

(defn make-hashmaps
  [n]
  (repeatedly n #(HashMap.)))
