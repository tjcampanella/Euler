(ns e14.core "Longest Collatz Sequence")

(defn collatz
  ([start] (collatz start [] {}))
  ([start memory]
   (collatz start [] memory))
  ([curr res memory]
   (cond
     (contains? memory curr) (concat res (memory curr))
     (= curr 1) (conj res 1)
     (even? curr) (collatz (/ curr 2) (conj res curr) memory)
     :else (collatz (inc (* 3 curr)) (conj res curr) memory))))

(defn find-longest-collatz [limit]
  (loop [curr-max 1 start-max 1 vals (range 1 limit) memory {}]
    (let [res (collatz (first vals) memory)
          length (count res)
          new-memory (assoc memory (first vals) res)]
      (cond
        (empty? (rest vals)) [start-max curr-max]
        (> length curr-max) (recur length (first vals) (rest vals) new-memory)
        :else (recur curr-max start-max (rest vals) new-memory)))))

;; (time (find-longest-collatz 1000000))