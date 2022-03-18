package com.example.com.SpringLessons.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

        public int[] sort(int[] numbers) {

            return numbers;
        }

    }
