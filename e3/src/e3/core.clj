(ns e3.core "Find largest prime factor"
    (import java.lang.Math))

(defn prime-factors-of
  "Finds the prime factors of an integer and returns them as a vector."
  [n]
  (loop [factors [] n n candidate 2]
    (cond
      (= n 1) factors
      (= 0 (rem n candidate)) (recur (conj factors candidate) (quot n candidate) candidate)
      (> candidate (Math/sqrt n)) (conj factors n)
      :else (recur factors n (inc candidate)))))
