 String printdata = jTextArea1.getText();
        PrinterJob job = PrinterJob.getPrinterJob();
        boolean doprint = job.printDialog();
        if(doPrint)
        {
            try{
                job.print();

            }
            catch(PrinterException ex)
            {
            }
        }
