(ns e4.core "Largest Palindromic Product"
    (:require [clojure.string :as str]))

(defn is-palindrome? [n]
  (= (str n) (str/join (reverse (str n)))))

(defn get-start-num [limit]
  (let [times (dec (count (str limit)))]
    (nth (iterate (partial * 10) 1) times)))

(defn find-largest-palindromic-product [limit]
  (let [prods (for [x1 (range (get-start-num limit) (inc limit))
                    x2 (range (get-start-num limit) (inc limit))]
                (* x1 x2))]
    (apply max (filter is-palindrome? prods))))

