(ns e8.core "Largest Product In a Series"
    (:require [clojure.string :as str]))

(defn read-data []
  (let [chars (-> (slurp "data.txt")
                  (str/replace #"\n" "")
                  (str/split #""))]
    (map #(Integer/parseInt %) chars)))

(def nums (read-data))

(defn largest-prod [window nums]
  (loop [nums nums
         curr-subset (take window nums)
         curr-max 0
         curr-prod (reduce *' curr-subset)]
    (let [next-nums (rest nums)
          next-subset (take window next-nums)
          next-prod (reduce *' curr-subset)]
      (cond
        (empty? curr-subset) curr-max
        (< curr-max curr-prod) (recur next-nums next-subset curr-prod next-prod)
        :else (recur next-nums next-subset curr-max next-prod)))))
