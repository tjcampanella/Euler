(ns e6.core "Sum Square Difference")

(defn sum-squares-up-to [limit]
  (reduce +
          (map #(Math/pow % 2) (range 1 (inc limit)))))

(defn square-of-sum-up-to [limit]
  (Math/pow (reduce + (range 1 (inc limit))) 2))

(defn sum-square-diff [limit]
  (let [sum (sum-squares-up-to limit)
        square (square-of-sum-up-to limit)]
    (int (- square sum))))

