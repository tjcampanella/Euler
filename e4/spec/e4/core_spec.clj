(ns e4.core-spec
  (:require [speclj.core :as s]
            [e4.core :refer [is-palindrome? find-largest-palindromic-product]]))

(s/describe "Is Palindrome"
            (s/it "Should return true for 99"
                  (s/should= true (is-palindrome? 99)))
            (s/it "Should return true for 123321"
                  (s/should= true (is-palindrome? 123321)))
            (s/it "Should return true for 10001"
                  (s/should= true (is-palindrome? 10001)))
            (s/it "Should return true for 923456654329"
                  (s/should= true (is-palindrome? 923456654329))))

(s/describe "Find largest pal"
            (s/it "Should return 9009 for largest pal up to 99"
                  (s/should= 9009 (find-largest-palindromic-product 99)))
            (s/it "Should return 906609 for largest pal up to 999"
                  (s/should= 906609 (find-largest-palindromic-product 999))))

            ;; Long running test
            ;; (s/it "Should return 99000099 for largest pal up to 9999"
            ;;       (s/should= 99000099 (find-largest-palindromic-product 9999)))