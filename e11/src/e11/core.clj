(ns e11.core "Largest Product in a Grid"
    (:require [clojure.string :as str]))

(defn convert-row-to-int [row]
  (mapv #(Integer/parseInt %) row))

(def data (->> (-> (slurp "data.txt")
                   (str/split-lines))
               (mapv #(str/split % #" "))
               (mapv convert-row-to-int)))

(defn greatest-prod-in-row
  [row]
  (->> row
       (partition 4 1 [1])
       (map #(reduce * %))
       (flatten)
       (apply max)))

(defn transpose [grid]
  (if (empty? grid)
    []
    (apply mapv vector grid)))

(defn greatest-prod-adj-horizontally [grid]
  (let  [res (map greatest-prod-in-row grid)]
    (if (empty? res) 0 (apply max res))))

(defn greatest-prod-adj-vertically [grid]
  (let  [res (map greatest-prod-in-row (transpose grid))]
    (if (empty? res) 0 (apply max res))))

(defn diagnols [grid]
  grid)

(defn greatest-prod-adj [grid]
  (max (greatest-prod-adj-horizontally grid) (greatest-prod-adj-vertically grid)))




