(ns e3.core "Find largest prime factor"
    (import java.lang.Math))

(defn prime-factors-of
  ([n]
   (prime-factors-of n 2 []))
  ([n candidate factors]
   (cond (<= n 1) factors
         (zero? (rem n candidate)) (recur (/ n candidate) candidate (conj factors candidate))
         :else (recur n (inc candidate) factors))))
