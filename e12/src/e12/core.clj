(ns e12.core "Highly divisible triangular number")


;; Ineffiecent to use this to calculate factors of for each triangle number
(defn factors-of
  ([n]
   (factors-of n 1 []))
  ([n candidate factors]
   (cond
     (<= n 1) factors
     (zero? (rem n candidate)) (recur n (if (odd? n) (+ 2 candidate) (inc candidate)) (conj factors candidate))
     (>= candidate (/ n 2)) (if (= 1 (count factors)) (conj factors n) factors)
     :else (recur n (if (odd? n) (+ 2 candidate) (inc candidate)) factors))))

(defn gen-triangle-numbers [n]
  (loop [idx 1 prev 1 vals []]
    (cond
      (> idx n) vals
      :else (recur (inc idx) (+ prev idx) (conj vals (+ prev (dec idx)))))))

(def triangles (gen-triangle-numbers 10000000))

;; Trick is to calculate the number of prime factors for each number up to
;; square root of n and then mulitple that by 2 to get the number of factors
(defn num-of-divisors [n]
  (* 2 (count (filter #(= (mod n %) 0) (range 2 (inc (int (Math/sqrt n))))))))

(defn find-first-triangle-500-divs []
  (first (drop-while #(< (num-of-divisors %) 500) triangles)))

