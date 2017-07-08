(ns clojure-fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [clojure-fizzbuzz.core :refer [fizzbuzz fizzbuzz_loop]]))

(deftest fizzbuzz-test

  (testing "Returns number if not a multiple of 3 or 5"
    (is (= (fizzbuzz 1) 1)))

  (testing "Returns fizz if number is a multiple of 3"
    (is (= (fizzbuzz 3) "fizz")))

  (testing "Returns buzz if number is a multiple of 5"
    (is (= (fizzbuzz 5) "buzz")))

  (testing "Returns Fizzbuzz if number is a multiple of 5 and 3"
    (is (= (fizzbuzz 15) "Fizzbuzz"))))

(deftest fizzbuzz_loop-test
 (let [fizz_result '(1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz" 11 "fizz" 13 14 "Fizzbuzz" 16 17 "fizz" 19 "buzz" "fizz" 22 23 "fizz" "buzz" 26 "fizz" 28 29 "Fizzbuzz")]
  (testing "Returns fizzbuzzed vector of range if range is given"
    (is (= (fizzbuzz_loop) fizz_result)))))
