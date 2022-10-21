(ns e2.core "Even Fibbonacci Numbers")

(defn fib [n]
  (cond
    (= n 0) 1
    (= n 1) 1
    :else (+ (fib (- n 1)) (fib (- n 2)))))

(defn fib_lst [n]
  (map fib (range n)))
