ScrollView scrollView = findViewById(R.id.scrollView); // Replace with the ID of your ScrollView

View targetView = findViewById(R.id.targetView); // Replace with the ID of the target view to scroll to

scrollView.post(new Runnable() {
    @Override
    public void run() {
        scrollView.smoothScrollTo(0, targetView.getTop());
    }
});
