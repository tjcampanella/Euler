(ns e13.core "Large Sum"
    (:require [clojure.string :as str]))

(defn read-data []
  (->> (slurp "data.txt")
       (str/split-lines)
       (map #(bigint %))))

(def data (read-data))

(def sum (reduce + data))

(def first-10-of-sum (bigint (str/join (take 10 (str sum)))))