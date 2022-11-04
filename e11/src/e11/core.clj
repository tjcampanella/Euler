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

(defn top-diagnols [grid]
  (loop [rem grid res [] curr [] idx 0 iter 0]
    (cond
      (empty? (flatten rem)) res
      (= idx (- (count grid) iter)) (recur (map #(rest %) rem) (conj res curr) [] 0 (inc iter))
      :else (let [row (nth rem idx)]
              (recur rem res (conj curr (nth row idx)) (inc idx) iter)))))

(defn bottom-diagnols [grid]
  (loop [rem grid res [] curr [] idx (dec (count grid)) iter 0]
    (cond
      (empty? (flatten rem)) res
      (= idx -1) (recur (map #(rest %) rem) (conj res curr) [] (- (dec (count grid)) (inc iter)) (inc iter))
      :else (let [row (nth rem idx)]
              (recur rem res (conj curr (nth row idx)) (dec idx) iter)))))

(defn diagnols [grid]
  (let [top-left (top-diagnols grid)
        top-right (top-diagnols (reverse grid))
        bottom-left (bottom-diagnols grid)
        bottom-right (bottom-diagnols (reverse grid))]
    (distinct (remove empty? (concat top-left top-right bottom-left bottom-right)))))

(defn greatest-prod-adj-horizontally [grid]
  (let  [res (map greatest-prod-in-row grid)]
    (if (empty? res) 0 (apply max res))))

(defn greatest-prod-adj-vertically [grid]
  (let  [res (map greatest-prod-in-row (transpose grid))]
    (if (empty? res) 0 (apply max res))))

(defn greatest-prod-adj-diagnolly [grid]
  (let  [res (map greatest-prod-in-row (diagnols grid))]
    (if (empty? res) 0 (apply max res))))

(defn greatest-prod-adj [grid]
  (max (greatest-prod-adj-horizontally grid)
       (greatest-prod-adj-vertically grid)
       (greatest-prod-adj-diagnolly grid)))


(greatest-prod-adj-horizontally data)
(greatest-prod-adj-vertically data)
(greatest-prod-adj-diagnolly data)

(diagnols data)