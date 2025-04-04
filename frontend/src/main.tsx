import './index.css'
import App from './App.tsx'
import ReactDOM from 'react-dom/client'
import React from 'react'
import { QueryClient, QueryClientProvider } from '@tanstack/react-query'


ReactDOM.createRoot(document.getElementById("root")as HTMLElement).render(
  <React.StrictMode>
    <QueryClientProvider client={new QueryClient}>
    <App />
    </QueryClientProvider>
  </React.StrictMode>
)
