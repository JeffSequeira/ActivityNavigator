package com.jeff.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SortingBenchmarkActivity extends AppCompatActivity {

    private static RadioButton rButton;
    private RadioGroup rGroup;
    private EditText etArraySize;
    private TextView tvArrayGen, tvBsort;
    private int[] CloneArr, array;
    private TextView tvSsort;
    private TextView tvMsort;
    private TextView tvQsort;
    private TextView tvIsort;
    private TextView tvHsort;
    private Button btnBS;
    private Button btnSS;
    private Button btnMS;
    private Button btnQS;
    private Button btnIS;
    private Button btnHS;
    private Button btnBALL;
    private GridLayout gridLayout;
    private static Button btnGenerateArray, btnBubbleSort, btnSelectionSort, btnMergeSort, btnInsertionSort, btnQuickSort, btnHeapSort, btnBenchmarkAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sortingbenchmark_activity);
        etArraySize = (EditText) findViewById(R.id.etNum);
        tvArrayGen = (TextView) findViewById(R.id.tvCase);
        rGroup = (RadioGroup) findViewById(R.id.rgCases);
        btnGenerateArray = (Button) findViewById(R.id.btnGenerate);
        tvBsort = (TextView) findViewById(R.id.tvBS);
        tvSsort = (TextView) findViewById(R.id.tvSS);
        tvMsort = (TextView) findViewById(R.id.tvMS);
        tvQsort = (TextView) findViewById(R.id.tvQS);
        tvIsort = (TextView) findViewById(R.id.tvIS);
        tvHsort = (TextView) findViewById(R.id.tvHS);
        btnBS = (Button) findViewById(R.id.btnBubble);
        btnSS = (Button) findViewById(R.id.btnSelection);
        btnIS = (Button) findViewById(R.id.btnInsertion);
        btnHS = (Button) findViewById(R.id.btnHeap);
        btnMS = (Button) findViewById(R.id.btnMerge);
        btnQS = (Button) findViewById(R.id.btnQuick);
        btnBALL = (Button) findViewById(R.id.btnBenchmark);
        gridLayout=(GridLayout) findViewById(R.id.grid);
        gridLayout.setVisibility(GridLayout.GONE);
        btnBALL.setVisibility(GridLayout.GONE);
    }



    public void GenerateArray(View view) {


        int arraySize=0;
               try{
                   arraySize = Integer.parseInt(etArraySize.getText().toString());
               }catch(NumberFormatException e){
                   Toast.makeText(getBaseContext(), "Please Enter a Number", Toast.LENGTH_SHORT).show();
               }


        try{
            int radioID = rGroup.getCheckedRadioButtonId();

                    rButton = (RadioButton) findViewById(radioID);
                }catch(Exception e){
                    Toast.makeText(getBaseContext(), "Please Select a Case", Toast.LENGTH_SHORT).show();
                }
        String caseValues= null;
                try{
                    caseValues = rButton.getText().toString();


                switch (caseValues) {
                    case ("Best case"):
                        tvArrayGen.setText("Best Case");
                        array = bestCase(arraySize);
                        tvArrayGen.setText("Best Case of size " + arraySize);
                        break;

                    case ("Average case"):
                        tvArrayGen.setText("Average Case");
                        array = averageCase(arraySize);
                        tvArrayGen.setText("Average Case of size " + arraySize);
                        break;

                    case ("Worst case"):
                        tvArrayGen.setText("Worst Case");
                        array = worstCase(arraySize);
                        tvArrayGen.setText("Worst Case of size " + arraySize);
                        break;
                }
                }catch(Exception e){

                }
            }




    public static int[] bestCase(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = i + 1;
        return arr;
    }

    public static int[] averageCase(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int) (Math.random() * 1000);
        return arr;
    }

    public static int[] worstCase(int size) {
        int[] arr = new int[size];
        int index = 0;
        for (int i = size; i > 0; i--)
            arr[index] = i;
        index++;
        return arr;
    }

    public static void bubbleSort(int[] arry) {
        int swap = 0;
        int[] array = new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            array[i] = arry[i];
        }
        for (int a = 0; a < (array.length - 1); a++) {
            for (int b = 0; b < (array.length - a - 1); b++) {
                if (array[b] > array[b + 1]) /* For descending order use < */ {
                    swap = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = swap;
                }
            }
        }
    }


    public static void insertion(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
    }


    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }

    public static int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }


    public static void quick(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int arr[], int low, int high) {
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(arr, low, j);
        if (i < high)
            quickSort(arr, i, high);
    }

    static int N;

    public static void heap(int arr[]) {
        heapify(arr);
        for (int i = N; i > 0; i--) {
            swapNumbers(0, i, arr);
            N = N - 1;
            maxheap(arr, 0);
        }
    }


    public static void heapify(int arr[]) {
        N = arr.length - 1;
        for (int i = N / 2; i >= 0; i--)
            maxheap(arr, i);
    }


    public static void maxheap(int arr[], int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])
            max = right;

        if (max != i) {
            swapNumbers(i, max, arr);
            maxheap(arr, max);
        }
    }


    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }






    public void bubSorting(View view){
        CloneArr =array.clone();
        long start= System.currentTimeMillis();
        bubbleSort(CloneArr);
        long end=System.currentTimeMillis();
        long result=end-start;
        tvBsort.setText(""+result);
        btnGenerateArray.setEnabled(true);
        btnBALL.setEnabled(false);
        btnBS.setEnabled(false);
        btnMS.setEnabled(false);
        btnQS.setEnabled(false);
        btnIS.setEnabled(false);
        btnSS.setEnabled(false);
        btnHS.setEnabled(false);
    }

    public void selSorting(View view){
        CloneArr =array.clone();
        long start= System.currentTimeMillis();
        selectionSort(CloneArr);
        long end=System.currentTimeMillis();
        long result=end-start;
        tvSsort.setText(""+result);
    }

    public void merSorting(View view){
        CloneArr =array.clone();
        long start= System.currentTimeMillis();
        mergeSort(CloneArr);
        long end=System.currentTimeMillis();
        long result=end-start;
        tvMsort.setText(""+result);
    }

    public void qukSorting(View view){
        CloneArr =array.clone();
        long start= System.currentTimeMillis();
        quick(CloneArr);
        long end=System.currentTimeMillis();
        long result=end-start;
        tvQsort.setText(""+result);
    }

    public void insSorting(View view){
        CloneArr =array.clone();
        long start= System.currentTimeMillis();
        insertion(CloneArr);
        long end=System.currentTimeMillis();
        long result=end-start;
        tvIsort.setText(""+result);
    }

   public void heapSorting(View view){
        CloneArr =array.clone();
        long start= System.currentTimeMillis();
        heap(CloneArr);
        long end=System.currentTimeMillis();
        long result=end-start;
        tvHsort.setText(""+result);
    }


    public void benchMarkAll(View view){
        bubSorting(view);
        selSorting(view);
        merSorting(view);
        qukSorting(view);
        insSorting(view);
        heapSorting(view);
        btnGenerateArray.setEnabled(true);
        btnBALL.setEnabled(false);
        btnBS.setEnabled(false);
        btnMS.setEnabled(false);
        btnQS.setEnabled(false);
        btnIS.setEnabled(false);
        btnSS.setEnabled(false);
        btnHS.setEnabled(false);

    }



}

